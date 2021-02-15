//获取指定范围的值，不包括最大值
public static int getRandomNumber(int min, int max) {
	return (int) ((Math.random() * (max - min)) + min);
}
