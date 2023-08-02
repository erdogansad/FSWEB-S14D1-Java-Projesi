package Company;

import Company.Titles.JuniorDeveloper;
import Company.Titles.MidDeveloper;
import Company.Titles.SeniorDeveloper;

public class HRManager {
    String[] jDevs, mDevs, sDevs;

    public HRManager(String[] jDevs, String[] mDevs, String[] sDevs) {
        this.jDevs = jDevs;
        this.mDevs = mDevs;
        this.sDevs = sDevs;
    }

    public String getJDevs() {
        String temp = "";
        for (int i = 0; i < jDevs.length; i++) {
            temp += jDevs[i] + ", ";
        }
        return temp;
    }

    public String getMDevs() {
        String temp = "";
        for (int i = 0; i < mDevs.length; i++) {
            temp += mDevs[i] + ", ";
        }
        return temp;
    }

    public String getSDevs() {
        String temp = "";
        for (int i = 0; i < sDevs.length; i++) {
            temp += sDevs[i] + ", ";
        }
        return temp;
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        String[] temp = new String[jDevs.length + 1];
        for (int i = 0; i < jDevs.length; i++) {
            temp[i] = jDevs[i];
        }
        temp[temp.length - 1] = juniorDeveloper.getName();
        jDevs = temp;
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        String[] temp = new String[mDevs.length + 1];
        for (int i = 0; i < mDevs.length; i++) {
            temp[i] = mDevs[i];
        }
        temp[temp.length - 1] = midDeveloper.getName();
        mDevs = temp;
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        String[] temp = new String[sDevs.length + 1];
        for (int i = 0; i < sDevs.length; i++) {
            temp[i] = sDevs[i];
        }
        temp[temp.length - 1] = seniorDeveloper.getName();
        sDevs = temp;
    }
}
