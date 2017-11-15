public class Stock 
{
	String tickerSymbol;
	String companyName;
	int price;
	int totalShares;
	double percentChange;
	long marketCap;
	
	public Stock (
								String tickerSymbol,
								String companyName,
								int price,
								int totalShares
								)
	{
		this.tickerSymbol = tickerSymbol;
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0;
		this.marketCap = price * totalShares;
	}
	
	public void adjustPrice(int change)
	{
		this.percentChange = this.percentChange + change;
		this.price = this.price + this.price * change/100;
		this.marketCap = price * totalShares;
	}
	
	public String toString()
	{
		String s = " (";
		if (this.percentChange > 0)
		{
			s = " (+";
		}
		
		return	"Ticker Symbol: " + this.tickerSymbol + "\n" +
						"Company: " +  this.companyName + "\n" +
						"Current Price: $" + this.price + s + this.percentChange + "%)" + "\n" +
						"Market Cap: $" + this.marketCap + "\n";
	}
}