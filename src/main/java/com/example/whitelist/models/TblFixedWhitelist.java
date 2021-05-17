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
@Table(name = "tbl_fixed_whitelist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblFixedWhitelist.findAll", query = "SELECT t FROM TblFixedWhitelist t")
    , @NamedQuery(name = "TblFixedWhitelist.findByFixedId", query = "SELECT t FROM TblFixedWhitelist t WHERE t.fixedId = :fixedId")
    , @NamedQuery(name = "TblFixedWhitelist.findByAccountNumber", query = "SELECT t FROM TblFixedWhitelist t WHERE t.accountNumber = :accountNumber")
    , @NamedQuery(name = "TblFixedWhitelist.findByCreatedOn", query = "SELECT t FROM TblFixedWhitelist t WHERE t.createdOn = :createdOn")
    , @NamedQuery(name = "TblFixedWhitelist.findByCreatedBy", query = "SELECT t FROM TblFixedWhitelist t WHERE t.createdBy = :createdBy")
    , @NamedQuery(name = "TblFixedWhitelist.findByUpdatedOn", query = "SELECT t FROM TblFixedWhitelist t WHERE t.updatedOn = :updatedOn")
    , @NamedQuery(name = "TblFixedWhitelist.findByUpdatedBy", query = "SELECT t FROM TblFixedWhitelist t WHERE t.updatedBy = :updatedBy")
    , @NamedQuery(name = "TblFixedWhitelist.findByDeletionStatus", query = "SELECT t FROM TblFixedWhitelist t WHERE t.deletionStatus = :deletionStatus")})
public class TblFixedWhitelist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fixed_id")
    private Integer fixedId;
    @Basic(optional = false)
    @Column(name = "account_number")
    private String accountNumber;
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

    public TblFixedWhitelist() {
    }

    public TblFixedWhitelist(Integer fixedId) {
        this.fixedId = fixedId;
    }

    public TblFixedWhitelist(Integer fixedId, String accountNumber) {
        this.fixedId = fixedId;
        this.accountNumber = accountNumber;
    }

    public Integer getFixedId() {
        return fixedId;
    }

    public void setFixedId(Integer fixedId) {
        this.fixedId = fixedId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
        hash += (fixedId != null ? fixedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblFixedWhitelist)) {
            return false;
        }
        TblFixedWhitelist other = (TblFixedWhitelist) object;
        if ((this.fixedId == null && other.fixedId != null) || (this.fixedId != null && !this.fixedId.equals(other.fixedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.whitelist.models.TblFixedWhitelist[ fixedId=" + fixedId + " ]";
    }
    
}
