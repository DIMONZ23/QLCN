package QLCN;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCanBo {
    private List<CanBo> canBoList;

    public QLCanBo() {
        this.canBoList = new ArrayList<>();
    }

    public void addCanBo(CanBo canBo) {
        this.canBoList.add(canBo);
    }

    public List<CanBo> searchCanBoByHoTen(String hoTen) {
        return this.canBoList.stream().filter(o -> o.getHoTen().contains(hoTen)).collect(Collectors.toList());
    }

    public void showListInforCanBo() {
        canBoList.forEach(CanBo::display);
    }
}