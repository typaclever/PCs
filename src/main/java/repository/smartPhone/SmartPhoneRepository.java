package repository.smartPhone;

import model.SmartPhone.SmartPhone;

public interface SmartPhoneRepository {
    void save(SmartPhone smartPhone);
    void update(SmartPhone smartPhone);
    void delete(SmartPhone smartPhone);
    SmartPhone findById(int id);
}
