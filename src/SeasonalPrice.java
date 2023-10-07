import java.util.Date;

public class SeasonalPrice {
    private Date startDate;
    private Date endDate;
    private double multiplier;

    public SeasonalPrice(Date startDate, Date endDate, double multiplier) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.multiplier = multiplier;
    }

    public boolean isDateWithinSeason(Date date) {
        return date.compareTo(startDate) >= 0 && date.compareTo(endDate) <= 0;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
