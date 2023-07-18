package com.lexi.vlogapp.Service.impl;

import com.lexi.vlogapp.Service.NotificationService;
import com.lexi.vlogapp.entity.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Override
    public Boolean sendLikeNotification(User user, String msg) {
        /*
        This method is waiting for implement and it depends on front-end framework
         */
        // return true = notification has been sent successfully.
        return true;
    }

}
