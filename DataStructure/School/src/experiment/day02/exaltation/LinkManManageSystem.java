package experiment.day02.exaltation;

public class LinkManManageSystem {
    public static void main(String[] args) {
        //创建一个通讯录
        AddressList addressList = new AddressList();
        //新增联系人
        addressList.enter();
        addressList.enter();

        //查看联系人数量
        addressList.getSize();
        //查看所以联系人信息
        addressList.display();

        //删除联系人
        addressList.delete_name();
        //查看联系人数量
        addressList.getSize();
        //查看所有联系人信息
        addressList.display();

        //将信息保存
        addressList.save();

        //将信息读出
        addressList.load();


    }
}
