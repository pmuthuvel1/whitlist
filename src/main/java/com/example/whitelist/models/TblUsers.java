/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.whitelist.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Muthuvel P <pmuthuvel@gmail.com>
 */
@Entity
@Table(name = "tbl_users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblUsers.findAll", query = "SELECT t FROM TblUsers t")
    , @NamedQuery(name = "TblUsers.findById", query = "SELECT t FROM TblUsers t WHERE t.id = :id")
    , @NamedQuery(name = "TblUsers.findByUserId", query = "SELECT t FROM TblUsers t WHERE t.userId = :userId")
    , @NamedQuery(name = "TblUsers.findByPassword", query = "SELECT t FROM TblUsers t WHERE t.password = :password")
    , @NamedQuery(name = "TblUsers.findByRoleName", query = "SELECT t FROM TblUsers t WHERE t.roleName = :roleName")
    , @NamedQuery(name = "TblUsers.findByCreatedOn", query = "SELECT t FROM TblUsers t WHERE t.createdOn = :createdOn")
    , @NamedQuery(name = "TblUsers.findByCreatedBy", query = "SELECT t FROM TblUsers t WHERE t.createdBy = :createdBy")
    , @NamedQuery(name = "TblUsers.findByUpdatedOn", query = "SELECT t FROM TblUsers t WHERE t.updatedOn = :updatedOn")
    , @NamedQuery(name = "TblUsers.findByUpdatedBy", query = "SELECT t FROM TblUsers t WHERE t.updatedBy = :updatedBy")
    , @NamedQuery(name = "TblUsers.findByDeletionStatus", query = "SELECT t FROM TblUsers t WHERE t.deletionStatus = :deletionStatus")})
public class TblUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "user_id")
    private String userId;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "deletion_status")
    private Character deletionStatus;

    public TblUsers() {
    }

    public TblUsers(Integer id) {
        this.id = id;
    }

    public TblUsers(Integer id, String userId, String password, String roleName) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.roleName = roleName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Character getDeletionStatus() {
        return deletionStatus;
    }

    public void setDeletionStatus(Character deletionStatus) {
        this.deletionStatus = deletionStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblUsers)) {
            return false;
        }
        TblUsers other = (TblUsers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.whitelist.models.TblUsers[ id=" + id + " ]";
    }
    
}
