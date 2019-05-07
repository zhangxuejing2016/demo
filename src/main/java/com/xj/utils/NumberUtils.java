package com.xj.utils;

import com.google.common.collect.Lists;
import org.apache.commons.collections.CollectionUtils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/1/26.
 */
public class NumberUtils {
    public NumberUtils() {
    }

    public static final BigDecimal plus(double number1, double number2) {
        BigDecimal decimal1 = new BigDecimal(number1);
        BigDecimal decimal2 = new BigDecimal(number2);
        return decimal1.add(decimal2).setScale(2, 5);
    }

    public static final BigDecimal plus(long number1, long number2) {
        BigDecimal decimal1 = new BigDecimal(number1);
        BigDecimal decimal2 = new BigDecimal(number2);
        return decimal1.add(decimal2).setScale(2, 5);
    }

    public static final BigDecimal plus(Long number1, Long number2) {
        number1 = nullToZero(number1);
        number2 = nullToZero(number2);
        BigDecimal decimal1 = new BigDecimal(number1);
        BigDecimal decimal2 = new BigDecimal(number2);
        return decimal1.add(decimal2).setScale(2, 5);
    }

    public static final BigDecimal plus(BigDecimal decimal1, long number2) {
        BigDecimal decimal2 = new BigDecimal(number2);
        return decimal1 == null ? decimal2.setScale(2, 5) : decimal1.add(decimal2).setScale(2, 5);
    }

    public static final BigDecimal plus(BigDecimal decimal1, BigDecimal decimal2) {
        if (decimal1 == null && decimal2 == null) {
            return BigDecimal.ZERO;
        } else if (decimal1 == null) {
            return decimal2.setScale(2, 5);
        } else {
            return decimal2 == null ? decimal1.setScale(2, 5) : decimal1.add(decimal2).setScale(2, 5);
        }
    }

    public static final BigDecimal sub(double number1, double number2) {
        BigDecimal decimal1 = new BigDecimal(number1);
        BigDecimal decimal2 = new BigDecimal(number2);
        return decimal1.subtract(decimal2).setScale(2, 5);
    }

    public static final BigDecimal sub(long number1, long number2) {
        BigDecimal decimal1 = new BigDecimal(number1);
        BigDecimal decimal2 = new BigDecimal(number2);
        return decimal1.subtract(decimal2).setScale(2, 5);
    }

    public static final BigDecimal sub(BigDecimal decimal1, BigDecimal decimal2) {
        if (decimal1 == null) {
            decimal1 = BigDecimal.ZERO;
        }

        if (decimal2 == null) {
            decimal2 = BigDecimal.ZERO;
        }

        return decimal1.subtract(decimal2).setScale(2, 5);
    }

    public static final BigDecimal multiply(long number1, long number2) {
        BigDecimal decimal1 = new BigDecimal(number1);
        BigDecimal decimal2 = new BigDecimal(number2);
        return decimal1.multiply(decimal2).setScale(2, 5);
    }

    public static final BigDecimal multiply(double number1, double number2) {
        BigDecimal decimal1 = new BigDecimal(number1);
        BigDecimal decimal2 = new BigDecimal(number2);
        return decimal1.multiply(decimal2).setScale(2, 5);
    }

    public static final BigDecimal multiply(BigDecimal decimal1, long number2) {
        if (decimal1 == null) {
            return BigDecimal.ZERO;
        } else {
            BigDecimal decimal2 = new BigDecimal(number2);
            return decimal1.multiply(decimal2).setScale(2, 5);
        }
    }

    public static final BigDecimal multiply(BigDecimal decimal1, double number2) {
        if (decimal1 == null) {
            return BigDecimal.ZERO;
        } else {
            BigDecimal decimal2 = new BigDecimal(number2);
            return decimal1.multiply(decimal2).setScale(2, 5);
        }
    }

    public static final BigDecimal multiply(BigDecimal decimal1, BigDecimal decimal2) {
        if (decimal1 == null) {
            return BigDecimal.ZERO;
        } else {
            return decimal2 == null ? BigDecimal.ZERO : decimal1.multiply(decimal2).setScale(2, 5);
        }
    }

    public static final BigDecimal div(long number1, long number2) {
        if (number2 == 0L) {
            return BigDecimal.ZERO;
        } else {
            BigDecimal decimal1 = new BigDecimal(number1);
            BigDecimal decimal2 = new BigDecimal(number2);
            return decimal1.divide(decimal2, 2, 5);
        }
    }

    public static final BigDecimal min(BigDecimal decimal1, BigDecimal decimal2) {
        if (decimal1 == null && decimal2 == null) {
            return null;
        } else if (decimal1 == null) {
            return decimal2;
        } else {
            return decimal2 == null ? decimal1 : decimal1.min(decimal2);
        }
    }

    public static final BigDecimal max(BigDecimal decimal1, BigDecimal decimal2) {
        if (decimal1 == null && decimal2 == null) {
            return null;
        } else if (decimal1 == null) {
            return decimal2;
        } else {
            return decimal2 == null ? decimal1 : decimal1.max(decimal2);
        }
    }

    /** @deprecated */
    @Deprecated
    public static final String getAmountDouble(BigDecimal decimal) {
        return getAmountString(decimal);
    }

    public static final String getAmountString(BigDecimal decimal) {
        return decimal == null ? "0" : decimal.setScale(2, 5).toString();
    }

    public static final BigDecimal parseAmount(String amountStr) {
        if (StringUtils.isEmptyOrNull(amountStr)) {
            return null;
        } else {
            BigDecimal amount = new BigDecimal(amountStr);
            return amount.setScale(2, 5);
        }
    }

    public static final boolean eq(BigDecimal decimal1, BigDecimal decimal2) {
        if (decimal1 == null && decimal2 == null) {
            return true;
        } else if (decimal1 == null) {
            return decimal2.compareTo(BigDecimal.ZERO) == 0;
        } else if (decimal2 == null) {
            return decimal1.compareTo(BigDecimal.ZERO) == 0;
        } else {
            return decimal1.compareTo(decimal2) == 0;
        }
    }

    public static final boolean eq(Integer decimal1, Integer decimal2) {
        if (decimal1 == null && decimal2 == null) {
            return true;
        } else if (decimal1 == null) {
            return decimal2 == 0;
        } else if (decimal2 == null) {
            return decimal1 == 0;
        } else {
            return decimal1 == decimal2;
        }
    }

    public static final boolean eq(Long decimal1, Long decimal2) {
        if (decimal1 == null && decimal2 == null) {
            return true;
        } else if (decimal1 == null) {
            return decimal2 == 0L;
        } else if (decimal2 == null) {
            return decimal1 == 0L;
        } else {
            return decimal1 == decimal2;
        }
    }

    public static final Long sum(Collection<Long> values) {
        Long sum = 0L;
        if (CollectionUtils.isEmpty(values)) {
            return sum;
        } else {
            Long value;
            for(Iterator i$ = values.iterator(); i$.hasNext(); sum = sum + value) {
                value = (Long)i$.next();
            }

            return sum;
        }
    }

    public static final int compare(BigDecimal decimal1, BigDecimal decimal2) {
        if (decimal1 == null && decimal2 == null) {
            return 0;
        } else if (decimal1 == null) {
            return 1;
        } else {
            return decimal2 == null ? -1 : decimal1.compareTo(decimal2);
        }
    }

    public static final int compareNullMin(BigDecimal decimal1, BigDecimal decimal2) {
        if (decimal1 == null && decimal2 == null) {
            return 0;
        } else if (decimal1 == null) {
            return -1;
        } else {
            return decimal2 == null ? 1 : decimal1.compareTo(decimal2);
        }
    }

    public static long yuan2Fen(BigDecimal yuan) {
        BigDecimal fen = multiply(yuan, 100L);
        return fen.longValue();
    }

    public static BigDecimal fen2Yuan(long fen) {
        BigDecimal yuan = div(fen, 100L);
        return yuan;
    }

    public static String fen2YuanString(long fen) {
        BigDecimal yuan = fen2Yuan(fen);
        return yuan.toString();
    }

    public static final BigDecimal div(long number1, long number2, int scale, int roundingMode) {
        if (number2 == 0L) {
            return BigDecimal.ZERO;
        } else {
            BigDecimal decimal1 = new BigDecimal(number1);
            BigDecimal decimal2 = new BigDecimal(number2);
            return decimal1.divide(decimal2, scale, roundingMode);
        }
    }

    public static void main(String[] args) {
        List<Long> values = Lists.newArrayList(new Long[]{1L, 2L, 3L, 4L, 5L});
        System.out.println(sum(values));
    }

    public static BigDecimal nullToZero(BigDecimal number) {
        return number == null ? BigDecimal.ZERO : number;
    }

    public static Long nullToZero(Long number) {
        return number == null ? 0L : number;
    }

    public static Integer nullToZero(Integer number) {
        return number == null ? 0 : number;
    }

    public static Double nullToZero(Double number) {
        return number == null ? 0.0D : number;
    }
}
