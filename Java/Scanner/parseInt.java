//用于接收int类型数据，并保证不会出错
boolean flag1 = false;
do {
    flag1 = false;
    try {
        log.info("Please Enter Customer ID To Search");
        System.out.println("Please Enter Customer ID To Search")
        customerID = Integer.parseInt(Sc.sc.nextLine());
        System.out.println("你输入数据格式正确")
    } catch (NumberFormatException e) {
        log.info("incorrect number, please try again");
        System.out.println("incorrect number, please try again")
        flag1 = true;
        System.out.println("你输入数据格式错误，请重新再次输入");
    }
} while (flag1);

//另外一种简单的方法
while(true) {
    System.out.println("Please Enter a number");
    int a = 0;
    try {
        a = Integer.parseInt(Sc.sc.nextLine());		
        break;
    } catch (NumberFormatException e) {
        continue;
    }
}