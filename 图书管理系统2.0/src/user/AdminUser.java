package user;

import operation.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name){
        super(name);
        this.iOoperations=new IOoperation[]{
                new ExitOperation(),
                new AddOperation(),
                new FindOperation(),
                new DelOperation(),
                new DisplayOperation(),
        };
    }
    public int  menu(){
        System.out.println("===============================");
        System.out.println("hello"+this.name+"欢迎来到这里");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("===============================");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        return choice;
    }
}
