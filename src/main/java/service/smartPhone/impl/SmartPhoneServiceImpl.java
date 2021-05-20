package service.smartPhone.impl;

import Exeptions.smartPhone.SmartPhoneDeleteException;
import Exeptions.smartPhone.SmartPhoneUpdateException;
import lombok.Data;
import lombok.NonNull;
import model.smartPhone.SmartPhone;
import repository.smartPhone.SmartPhoneRepository;
import service.smartPhone.SmartPhoneService;

import java.util.List;

@Data
public class SmartPhoneServiceImpl implements SmartPhoneService {
    @NonNull
    private SmartPhoneRepository repository;

    @Override
    public SmartPhone findSmartPhone(int id) {
        return repository.findById(id);
    }

    @Override
    public SmartPhone saveSmartPhone(SmartPhone smartPhone) {
        return repository.save(smartPhone);
    }

    @Override
    public SmartPhone deleteSmartPhone(SmartPhone smartPhone) {
        try {
            return repository.delete(smartPhone);
        } catch (SmartPhoneDeleteException e) {
            e.printStackTrace();
        }
        return smartPhone;
    }

    @Override
    public SmartPhone updateSmartPhone(SmartPhone smartPhone) {
        try {
            return repository.update(smartPhone);
        } catch (SmartPhoneUpdateException e) {
            e.printStackTrace();
        }
        return smartPhone;
    }

    @Override
    public List<SmartPhone> getAllSmartPhones() {
        return repository.getAll();
    }
}
