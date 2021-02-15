Steps to use Lambda

    1. create an interface first

        interface MyLambdaInterface{
            void doSomeThing(String s);
        }

    2. create an variable and override 

        MyLambdaInterface myName = s -> System.out.println(s);

    3. call and use

        myName.
