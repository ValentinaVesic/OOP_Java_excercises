package Planinarenje;

import java.util.ArrayList;

public class Pro extends Planinar {
    public Pro(ArrayList<Planina> listaPlanina, double maxUspon) {
        super(listaPlanina, maxUspon);
    }

    @Override
    public void izbaci() {
        for (int i = getListaPlanina().size() - 1; i >= 0; i--) {
            if (getListaPlanina().get(i).getVisina() > getMaxUspon()) {
                getListaPlanina().remove(i);
            }
        }
    }
}

