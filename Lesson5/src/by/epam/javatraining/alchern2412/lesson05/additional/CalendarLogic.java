package by.epam.javatraining.alchern2412.lesson05.additional;

/**
 *
 * @author Alex
 */
public class CalendarLogic {

    private static final int MIN_COUNT = 1;

    private static final int YEAR_MAX_COUNT = 9999;
    private static final int MONTH_MAX_COUNT = 12;

    private static final int DAY_COUNT30 = 30;
    private static final int DAY_COUNT31 = 31;
    private static final int DAY_COUNT29 = 29;
    private static final int DAY_COUNT28 = 28;

    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;
    private static final int MAY = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;
    private static final int AUGUST = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER = 10;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;

    public static String getNextDay(int dd, int mm, int yy) {
        String result;
        if (yy >= MIN_COUNT && yy <= YEAR_MAX_COUNT) {
            if (mm >= MIN_COUNT && mm <= MONTH_MAX_COUNT) {
                if ((mm == JANUARY || mm == MARCH || mm == MAY || mm == JULY
                        || mm == AUGUST || mm == OCTOBER || mm == DECEMBER)
                        && dd <= DAY_COUNT31) {
                    if (dd != DAY_COUNT31) {
                        dd++;
                    } else {
                        dd = 1;
                        if (mm != MONTH_MAX_COUNT) {
                            mm++;
                        } else {
                            mm = 1;
                            yy++;
                        }
                    }
                } else if ((mm == APRIL || mm == JUNE || mm == SEPTEMBER
                        || mm == NOVEMBER) && dd <= DAY_COUNT30) {
                    if (dd != DAY_COUNT30) {
                        dd++;
                    } else {
                        dd = 1;
                        if (mm != MONTH_MAX_COUNT) {
                            mm++;
                        } else {
                            mm = 1;
                            yy++;
                        }
                    }
                } else if (mm == FEBRUARY
                        && dd <= DAY_COUNT29 && (yy % 4 == 0 && yy % 100 != 0
                        || yy % 4 == 0 && yy % 100 == 0 && yy % 400 == 0)) {
                    if (dd != DAY_COUNT29) {
                        dd++;
                    } else {
                        dd = 1;
                        if (mm != MONTH_MAX_COUNT) {
                            mm++;
                        } else {
                            mm = 1;
                            yy++;
                        }
                    }
                } else if (mm == FEBRUARY && dd <= DAY_COUNT28
                        && (yy % 4 == 0 && yy % 100 == 0 && yy % 400 != 0)) {
                    if (dd != DAY_COUNT28) {
                        dd++;
                    } else {
                        dd = 1;
                        if (mm != MONTH_MAX_COUNT) {
                            mm++;
                        } else {
                            mm = 1;
                            yy++;
                        }
                    }
                } else {
                    result = "Error in day range [1 - 28|29|30|31], depends month";
                }
                result = dd + "." + mm + "." + yy;

            } else {
                result = "Error in month range [1 - 12]";

            }

        } else {
            result = "Error in year range [1 - 9999]";
        }
        return result;
    }
}
