/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.whitelist.repos;

import com.example.whitelist.models.TblUsers;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Muthuvel P <pmuthuvel@gmail.com>
 */
public class TblUsersRepoCustomImpl implements TblUsersRepoCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public TblUsers findByUserId(String userId) throws Exception {
        TypedQuery<TblUsers> query = em.createNamedQuery("TblUsers.findByUserId",TblUsers.class);      
        query.setParameter("userId", userId);
        return query.getResultList().get(0);
    }
}
