Steps to use Lambda

    1. create an interface first

        interface MyLambdaInterface{
            void doSomeThing(String s);
        }

    2. create an variable and override 

        MyLambdaInterface myName = s -> System.out.println(s);

    3. call and use

        myName.doSomeThing("nihao");

    
Steps for java 7 该方式能够覆盖原来已经实现的方法

MyLambdaInterface m1 = new MyLambdaInterface(){
    @override
    public void doSomeThing(String s){
        System.out.println(s);
    }
}
