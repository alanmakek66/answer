package redocustomer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class order {
  private String orderNo;
  private item[] items;
  private LocalDate date;
  private double total;

  public order(String orderNo/* , LocalDate date */) {
    this.orderNo = orderNo;
    this.items = new item[0];
    this.date = LocalDate.now();
    this.total = total();
  }

  public double total() {
    BigDecimal total = BigDecimal.valueOf(0.0d);
    for (int i = 0; i < items.length; i++) {
      total = total.add(BigDecimal.valueOf(items[i].subtotal()));
    }
    return total.doubleValue();
  }

  private double calculateTotal() {
    BigDecimal total = BigDecimal.valueOf(0.0d);
    for (int i = 0; i < items.length; i++) {
      total = total.add(BigDecimal.valueOf(items[i].subtotal()));
    }
    return total.doubleValue();
  }

  public void add(item item) {
    item[] copyArr = this.items;// new Item[0];
    this.items = new item[this.items.length + 1];
    int idx = 0;
    for (int i = 0; i < copyArr.length; i++) {
      items[idx++] = copyArr[i];
    }
    items[idx] = item;
  }

  public boolean isFreeship() {
    if (this.total() > 100) {
      return true;
    }
    return false;
  }

  public String toString() {
    return "orderNo = " + this.orderNo + " date = " + this.date + " item = "
        + Arrays.toString(this.items) + " total = " + this.total()+"freeshipping or not"+
        this.isFreeship();

  }

  public static void main(String[] args) {

  }
}
