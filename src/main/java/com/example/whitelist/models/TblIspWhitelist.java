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
@Table(name = "tbl_isp_whitelist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblIspWhitelist.findAll", query = "SELECT t FROM TblIspWhitelist t")
    , @NamedQuery(name = "TblIspWhitelist.findByIspId", query = "SELECT t FROM TblIspWhitelist t WHERE t.ispId = :ispId")
    , @NamedQuery(name = "TblIspWhitelist.findByUserId", query = "SELECT t FROM TblIspWhitelist t WHERE t.userId = :userId")
    , @NamedQuery(name = "TblIspWhitelist.findByDomainName", query = "SELECT t FROM TblIspWhitelist t WHERE t.domainName = :domainName")
    , @NamedQuery(name = "TblIspWhitelist.findByCreatedOn", query = "SELECT t FROM TblIspWhitelist t WHERE t.createdOn = :createdOn")
    , @NamedQuery(name = "TblIspWhitelist.findByCreatedBy", query = "SELECT t FROM TblIspWhitelist t WHERE t.createdBy = :createdBy")
    , @NamedQuery(name = "TblIspWhitelist.findByUpdatedOn", query = "SELECT t FROM TblIspWhitelist t WHERE t.updatedOn = :updatedOn")
    , @NamedQuery(name = "TblIspWhitelist.findByUpdatedBy", query = "SELECT t FROM TblIspWhitelist t WHERE t.updatedBy = :updatedBy")
    , @NamedQuery(name = "TblIspWhitelist.findByDeletionStatus", query = "SELECT t FROM TblIspWhitelist t WHERE t.deletionStatus = :deletionStatus")})
public class TblIspWhitelist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "isp_id")
    private Integer ispId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private String userId;
    @Basic(optional = false)
    @Column(name = "domain_name")
    private String domainName;
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

    public TblIspWhitelist() {
    }

    public TblIspWhitelist(Integer ispId) {
        this.ispId = ispId;
    }

    public TblIspWhitelist(Integer ispId, String userId, String domainName) {
        this.ispId = ispId;
        this.userId = userId;
        this.domainName = domainName;
    }

    public Integer getIspId() {
        return ispId;
    }

    public void setIspId(Integer ispId) {
        this.ispId = ispId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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
        hash += (ispId != null ? ispId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblIspWhitelist)) {
            return false;
        }
        TblIspWhitelist other = (TblIspWhitelist) object;
        if ((this.ispId == null && other.ispId != null) || (this.ispId != null && !this.ispId.equals(other.ispId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.whitelist.models.TblIspWhitelist[ ispId=" + ispId + " ]";
    }
    
}
