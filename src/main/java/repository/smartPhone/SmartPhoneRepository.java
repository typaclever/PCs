package repository.smartPhone;

import model.smartPhone.SmartPhone;

import java.util.List;

public interface SmartPhoneRepository {
    SmartPhone save(SmartPhone smartPhone);
    SmartPhone update(SmartPhone smartPhone);
    SmartPhone delete(SmartPhone smartPhone);
    SmartPhone findById(int id);
    List<SmartPhone> getAll();
}
