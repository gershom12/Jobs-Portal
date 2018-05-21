package com.chowers.jobs.blog.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;

/**
 * @author Mohammad Mahdi mohammad.ghasemy@gmail.com
 */
@javax.persistence.Entity
public class AccessToken implements Entity
{
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String token;

    @ManyToOne
    private User user;

    @Column
    @Temporal(DATE)
    private Date expiry;

    protected AccessToken()
    {
        /* Reflection instantiation */
    }

    public AccessToken(User user, String token)
    {
        this.user = user;
        this.token = token;
    }

    public AccessToken(User user, String token, Date expiry)
    {
        this(user, token);
        this.expiry = expiry;
    }

    @Override
    public Long getId()
    {
        return this.id;
    }

    public String getToken()
    {
        return this.token;
    }

    public User getUser()
    {
        return this.user;
    }

    public Date getExpiry()
    {
        return this.expiry;
    }

    public boolean isExpired()
    {
        if (null == this.expiry) {
            return false;
        }

        return this.expiry.getTime() > System.currentTimeMillis();
    }
}