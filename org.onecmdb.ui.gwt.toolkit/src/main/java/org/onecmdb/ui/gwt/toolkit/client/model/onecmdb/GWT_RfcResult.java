/*
 * Lokomo OneCMDB - An Open Source Software for Configuration
 * Management of Datacenter Resources
 *
 * Copyright (C) 2006 Lokomo Systems AB
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 * 
 * Lokomo Systems AB can be contacted via e-mail: info@lokomo.com or via
 * paper mail: Lokomo Systems AB, Svärdvägen 27, SE-182 33
 * Danderyd, Sweden.
 *
 */
package org.onecmdb.ui.gwt.toolkit.client.model.onecmdb;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * The result of an update operation.
 *
 */
public class GWT_RfcResult implements IsSerializable {

	private boolean rejected = false;
	private String cause;
	private Long txId;

	public boolean isRejected() {
		return (this.rejected);
	}
	
	public void setRejected(boolean value) {
		this.rejected = value;
	}
	
	public String getRejectCause() {
		return (this.cause);
	}

	public void setRejectCause(String cause) {
		setRejected(true);
		this.cause = cause;
	}

	public String toString() {
		if (rejected) {
			return ("REJECTED <" + this.cause + ">");
		}
		return ("COMMITED");
	}

	public Long getTxId() {
		return txId;
	}

	public void setTxId(Long txId) {
		this.txId = txId;
	}
	
	public String getTxIdAsString() {
		if (this.txId == null) {
			return(null);
		}
		return(this.txId.toString());
	}
	
	public void setTxIdAsString(String id) {
		if (id == null) {
			return;
		}
		this.txId = new Long(Long.parseLong(id));
	}
	

}
