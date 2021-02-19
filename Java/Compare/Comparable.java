/* 
    用途：
        用于比较对象其中的一个值，不可以比较多个值
        如果需要比较多个值，需要使用Comparator接口

    Comparable接口的使用
        1. implements Comparable<Account>
        2. override compareTo method
    
*/

// Step 1
public class Account implements Comparable<Account>

// Step 2
public int compareTo(Account o)
{
    //想比较对象中的值就定义谁的值如id
    Integer a = this.id;
    Integer b = o.id;
    return b.compareTo(a);
}