# smartlogix-api
Transport System

## Overview
The **Overlandwest System** is a logistics and records tracking platform designed to manage and monitor delivery operations, shipment movement, and system activities.

This system functions similarly to other logistics platforms by keeping structured records of transactions, delivery progress, and user activities.

---

## Core Purpose
The main purpose of the system is to **track and store logistics-related records** such as:

- Sales / Orders
- Delivery Manifest
- Proof of Delivery (POD)
- Shipping and delivery status
- Driver / shipper assignments
- Customer records
- Audit logs for user actions

---

## Key Modules

### 1. Sales Management
Tracks all sales and order transactions.

**Includes:**
- order number
- customer details
- total amount
- payment method
- order date
- order status

---

### 2. Manifest Management
Used to group multiple deliveries into a single delivery trip or route.

**Includes:**
- manifest number
- assigned driver / shipper
- route / location
- trip date
- list of deliveries

---

### 3. Proof of Delivery (POD)
Stores delivery confirmation records.

**Includes:**
- delivered date and time
- recipient name
- signature
- photo proof
- GPS location (optional)
- linked sale / order
- linked manifest

---

### 4. Delivery Status Tracking
Monitors the progress of deliveries.

**Common statuses:**
- Pending
- In Transit
- Out for Delivery
- Delivered
- Failed Delivery
- Returned

---

### 5. User and Audit Logs
Tracks user activity inside the system.

**Examples:**
- login / logout
- create order
- update manifest
- confirm POD
- update inventory

This ensures accountability and record traceability.

