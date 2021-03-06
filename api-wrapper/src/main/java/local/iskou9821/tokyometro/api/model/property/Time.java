package local.iskou9821.tokyometro.api.model.property;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {
	private static ThreadLocal<DateFormat> Formats = new ThreadLocal<DateFormat>();
	
	private Date date;
	private Integer hour;
	private Integer min;
	private String caption;
	
	public Time() {
		super();
	}
	public Time(String str) {
		super();
		
		caption = str;
		try {
			DateFormat fmt = Formats.get();
			if (fmt == null) {
				fmt = new SimpleDateFormat("hh:mm");
				Formats.set(fmt);
			}
			
			try {
				date = fmt.parse(str);
			} catch (ParseException e) {
				throw new IllegalArgumentException(e);
			}
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			
			hour = cal.get(Calendar.HOUR);
			min = cal.get(Calendar.MINUTE);
		} catch (Exception e) {
			date = null;
			hour = null;
			min = null;
		}
	}
	
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getHour() {
		return hour;
	}
	public void setHour(Integer hour) {
		this.hour = hour;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	@Override
	public String toString() {
		return hour + ":" + min;
	}
}
