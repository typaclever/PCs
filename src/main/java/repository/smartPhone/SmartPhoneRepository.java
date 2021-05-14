package repository.smartPhone;

import model.smartPhone.SmartPhone;

public interface SmartPhoneRepository {
    void save(SmartPhone smartPhone);
    void update(SmartPhone smartPhone);
    void delete(SmartPhone smartPhone);
    SmartPhone findById(int id);
}
