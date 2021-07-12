package com.example.web.dao.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService {

    /*private final TgUserTableDaoWebRepository tgUserTableDaoWebRepository;

    @Autowired
    public AdminService(TgUserTableDaoWebRepository tgUserTableDaoWebRepository) {
        this.tgUserTableDaoWebRepository = tgUserTableDaoWebRepository;
    }

    public List<TgUserTable> findAllBlockUser(){
        return tgUserTableDaoWebRepository.findTgUserTableByBlockUserIsTrue();
    }

    public void deleteUserById(Long id){
        tgUserTableDaoWebRepository.deleteTgUserTableById(id);
    }

    public TgUserTable findBlockUserById(Long id){
        return tgUserTableDaoWebRepository.findTgUserTableById(id);
    }

    public void updateBlockStatusUser(Long id, Boolean blockUser){
        tgUserTableDaoWebRepository.updateBlockUserStatus(id, blockUser);
    }

    public TgUserTable searchTgUserForBlockList(String userName){
        return tgUserTableDaoWebRepository.findByUserName(userName);
    }

    public List<TgUserTable> findAllUsers(){
        return tgUserTableDaoWebRepository.findAll();
    }

    public void updateDataOfUser(Long id, String userName, String firstName, String lastName, String email,
                                 Date dateOfBirthday, Boolean active, Boolean blockUser, Boolean payment, UserRoles roles,
                                 CourseTable courseUser, GroupTable groupUser){
        tgUserTableDaoWebRepository.updateUsersData(id, userName, firstName, lastName, email, dateOfBirthday,
                active, blockUser, payment, roles, courseUser, groupUser);
    }

    public void addUserToDB(TgUserTable newTgUser){
        tgUserTableDaoWebRepository.save(newTgUser);
    }*/
}
