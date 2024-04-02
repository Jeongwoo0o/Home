package model.VO;

public class order {
    String pruduct;
    int count;
    int price;
    int totalc;
    int totalp;


    public String getPruduct() {
        return this.pruduct;
    }

    public void setPruduct(String pruduct) {
        this.pruduct = pruduct;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalc() {
        return this.totalc;
    }

    public void setTotalc(int totalc) {
        this.totalc = totalc;
    }

    public int getTotalp() {
        return this.totalp;
    }

    public void setTotalp(int totalp) {
        this.totalp = totalp;
    }

}
