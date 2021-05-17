/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.whitelist.repos;

import com.example.whitelist.models.TblUsers;

/**
 *
 * @author Muthuvel P <pmuthuvel@gmail.com>
 */
public interface TblUsersRepoCustom {
    TblUsers findByUserId(String userId)throws Exception;
}
