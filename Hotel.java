public class Hotel {

    boolean[] r = new boolean[5];  // 5 rooms initially free

    public String getStatus() {
        String status = "";
        for (int i = 0; i < r.length; i++) {
            status += "Room " + (i + 1) + (r[i] ? " booked" : " free") + "\n";
        }
        return status.trim();
    }

    public String book(int rn) {
        if (rn < 1 || rn > 5) {
            return "Invalid room";
        } else if (r[rn - 1]) {
            return "Already booked";
        } else {
            r[rn - 1] = true;
            return "Room " + rn + " booked";
        }
    }

    public String checkout(int rn) {
        if (rn < 1 || rn > 5) {
            return "Invalid room";
        } else if (!r[rn - 1]) {
            return "Already empty";
        } else {
            r[rn - 1] = false;
            return "Checked out Room " + rn;
        }
    }
}
