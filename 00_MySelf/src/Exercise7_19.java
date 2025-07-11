public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if (p.price <= money) {
            money -= p.price;
            add(p);
        } else {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
        }
    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] temp_cart = new Product[cart.length * 2];
            System.arraycopy(cart, 0, temp_cart, 0, i);
            cart = temp_cart;
            cart[i++] = p;
        } else {
            cart[i++] = p;
        }
    }

    void summary() {
        int total = 0;
        System.out.print("구입한 물건: ");
        for (Product p : cart) {
            total += p.price;
            System.out.print(p + ",");
        }
        System.out.println("\n사용한 금액: " + total);
        System.out.println("남은 금액: " + money);
    }
}

class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}
