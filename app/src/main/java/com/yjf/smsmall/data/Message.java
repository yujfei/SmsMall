/*
 * Copyright (c) 2010 - 2015 Ushahidi Inc
 * All rights reserved
 * Contact: team@ushahidi.com
 * Website: http://www.ushahidi.com
 * GNU Lesser General Public License Usage
 * This file may be used under the terms of the GNU Lesser
 * General Public License version 3 as published by the Free Software
 * Foundation and appearing in the file LICENSE.LGPL included in the
 * packaging of this file. Please review the following information to
 * ensure the GNU Lesser General Public License version 3 requirements
 * will be met: http://www.gnu.org/licenses/lgpl.html.
 *
 * If you have questions regarding the use of this file, please contact
 * Ushahidi developers at team@ushahidi.com.
 */

package com.yjf.smsmall.data;
import java.io.Serializable;
import java.util.Date;


/**
 * @author Henry Addo
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 1094372288105228610L;

    public Long _id;
    private String messageBody;
    private String messageFrom;
    private Date messageDate;
    private String messageUuid;
    private int sentResultCode;
    private String sentResultMessage;
    private int deliveryResultCode;
    private String deliveryResultMessage;
    private Date deliveredDate;
    private int retries;

    public Long getId() {
        return _id;
    }

    public void setId(Long id) {
        _id = id;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getMessageFrom() {
        return messageFrom;
    }

    public void setMessageFrom(String messageFrom) {
        this.messageFrom = messageFrom;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessageUuid() {
        return messageUuid;
    }

    public void setMessageUuid(String messageUuid) {
        this.messageUuid = messageUuid;
    }

    public int getSentResultCode() {
        return sentResultCode;
    }

    public void setSentResultCode(int sentResultCode) {
        this.sentResultCode = sentResultCode;
    }

    public String getSentResultMessage() {
        return sentResultMessage;
    }

    public void setSentResultMessage(String sentResultMessage) {
        this.sentResultMessage = sentResultMessage;
    }

    public int getDeliveryResultCode() {
        return deliveryResultCode;
    }

    public void setDeliveryResultCode(int deliveryResultCode) {
        this.deliveryResultCode = deliveryResultCode;
    }

    public String getDeliveryResultMessage() {
        return deliveryResultMessage;
    }

    public void setDeliveryResultMessage(String deliveryResultMessage) {
        this.deliveryResultMessage = deliveryResultMessage;
    }

    public Date getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    @Override
    public String toString() {
        return "Message{"
                + "messageBody='" + messageBody + '\''
                + ", messageFrom='" + messageFrom + '\''
                + ", messageDate=" + messageDate
                + ", messageUuid='" + messageUuid + '\''
                + ", sentResultCode=" + sentResultCode
                + ", sentResultMessage='" + sentResultMessage + '\''
                + ", deliveryResultCode=" + deliveryResultCode
                + ", deliveryResultMessage='" + deliveryResultMessage + '\''
                + ", deliveredDate=" + deliveredDate
                + ", retries=" + retries
                + '}';
    }


}
