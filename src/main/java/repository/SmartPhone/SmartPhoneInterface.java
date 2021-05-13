package repository.SmartPhone;

import someModels.SmartPhone.SmartPhone;

public interface SmartPhoneInterface {
    void save(SmartPhone smartPhone);
    void update(SmartPhone smartPhone);
    void delete(SmartPhone smartPhone);
    SmartPhone findById(int id);
}
