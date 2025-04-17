package Aula03.Atividade;

class Product {
    public String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Ovo() {
        this.name = "Ovo";
        this.price = 6.00;
    }


    void Info() {
        System.out.println("Nome: " + name);
        System.out.println("Preço: " + price);
    }

    void Mudar() {
        this.price = 9999.0;

    }

    public String getNome() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Preço inválido");
        }
    }


    
}
