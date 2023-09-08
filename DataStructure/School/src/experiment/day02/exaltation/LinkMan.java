package experiment.day02.exaltation;

class LinkMan {
    public String name;
    public String telN;
    public String qqN;


    public LinkMan() {

    }

    public LinkMan(String name, String telN, String qqN) {
        this.name = name;
        this.telN = telN;
        this.qqN = qqN;
    }

    //重写toString方法
    public String toString() {
        return "联系人姓名：" + this.name + "\n" + "联系人电话：" + this.telN + "\n" + "联系人qq号：" + this.qqN;
    }
}
