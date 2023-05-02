package day04;

/*
 * 某公司有 18 位員工
 * 其中 10 位在去年投資股票，一年的獲利率如下(單位：%)
 * 7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5
 * 另外 8 位員工投資買公債一年內獲利率如下(單位：%)
 * 6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.1, 7.2
 * 試分別求此公司的員工投資股票與公債的平均獲利率
 */
public class ArrayDemo3 {
	public static void main(String[] args) {
		double[] stockprofitRate = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
		double[] bondProfitRate = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.1, 7.2};
		double avgstockprofitRate = Util.getAvg(stockprofitRate);
		double avgBondProfitOfRate = Util.getAvg(bondProfitRate);
		System.out.printf("平均股票獲利率: %.1f%% 平均債卷獲利率: %.1f%%\n",avgstockprofitRate,avgBondProfitOfRate);		
		
	}
}