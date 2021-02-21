/* 
    用途：
        用于对象的比较，可以比较单个值，或多个值

    Comparator的使用

*/

//比较 a-z
Collections.sort(accountList, (a, b) -> a.getName().compareTo(b.getName()));

//比较 z-a
Collections.sort(accountList, (a, b) -> b.getName().compareTo(a.getName()));

//比较 0-9
Collections.sort(accountList, (a, b) -> a.getPrice() - b.getPrice());

//比较9-0
Collections.sort(accountList, (a, b) -> b.getPrice() - a.getPrice());

//比较 0-9 & a-z 
Collections.sort(accountList, (a, b) -> {
    int result = a.getPrice() - b.getPrice();
    if (result == 0) {
        return a.getName().compareTo(b.getName());
    }
    return result;
});