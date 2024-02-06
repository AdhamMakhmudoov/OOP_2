public class MyTime {

    private int hour;
    private int minute;
    private int second;

    public MyTime() {

    }

    public MyTime(int hour, int minute, int second) {
      setTime(hour,minute,second);
    }

    public boolean time(int hour, int minute, int second){
        return (hour >= 0 && hour <= 23)&&
                (minute >= 0 && minute <= 59)&&
                (second >= 0 && second <= 59);
    }

    public void setTime(int hour, int minute, int second){
        if(time(hour, minute, second)){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }else {
            System.out.println("Yaroqsiz soat, daqiqa yoki soniya!");
        }
    }

    public void nextSecond(){
        second = (second+1)%60;
        if(second==0){
            nextMinute();
        }
    }

    public void nextMinute(){
        minute = (minute+1)%60;
        if(minute==0){
            nextHour();
        }
    }

    public void nextHour(){
        hour = (hour+1)%24;
    }

    public void previusSecond(){
        second = (second-1)%60;
        if(second==59){
            previusMinute();
        }
    }

    public void previusMinute(){
        minute = (minute-1+60)%60;
        if(minute==59){
            previusHour();
        }
    }

    public void previusHour(){
        hour = (hour-1+24)%24;
    }

    public int getHour() {
            return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Yaroqsiz soat!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Yaroqsiz daqiqa!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Yaroqsiz soniya!");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}


