import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Estoque {
    private String fileName;
    private List<Produto> produtos;

    public Estoque(String fileName) {
        this.fileName = fileName;
        this.produtos = new ArrayList<>();
        carregarProdutos();
    }

    private void carregarProdutos() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                if (campos.length == 4) {
                    int id = Integer.parseInt(campos[0]);
                    String nome = campos[1];
                    int quantidade = Integer.parseInt(campos[2]);
                    double preco = Double.parseDouble(campos[3]);
                    produtos.add(new Produto(id, nome, quantidade, preco));
                }
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado ou erro na leitura. Criando novo arquivo.");
        }
    }

    private void salvarProdutos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Produto produto : produtos) {
                bw.write(produto.toCsv());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar produtos no arquivo: " + e.getMessage());
        }
    }

    private int gerarProximoId() {
        int maiorId = 0;
        for (Produto produto : produtos) {
            if (produto.getId() > maiorId) {
                maiorId = produto.getId();
            }
        }
        return maiorId + 1;
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        int novoId = gerarProximoId();
        Produto novoProduto = new Produto(novoId, nome, quantidade, preco);
        produtos.add(novoProduto);
        salvarProdutos();
        System.out.println("Produto adicionado com sucesso! ID: " + novoId);
    }

    public void excluirProduto(int idExcluir) {
        boolean encontrado = false;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == idExcluir) {
                produtos.remove(i);
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            salvarProdutos();
            System.out.println("Produto com ID " + idExcluir + " foi excluído com sucesso!");
        } else {
            System.out.println("Produto com ID " + idExcluir + " não encontrado.");
        }
    }

    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("Produtos em estoque:");
            for (Produto produto : produtos) {
                System.out.println(produto.toString());
            }
        }
    }

    public void atualizarQuantidade(int id, int novaQuantidade) {
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setQuantidade(novaQuantidade);
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            salvarProdutos();
            System.out.println("Quantidade do produto ID " + id + " atualizada para " + novaQuantidade);
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }
}