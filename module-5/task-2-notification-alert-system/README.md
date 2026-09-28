# Task 2

## Question

(Notification Alert System): Create an interface `NotificationService` with `sendAlert(String message, String recipient)`. Implement concrete classes `EmailNotification`, `SMSNotification`, and `PushNotification`. Create a `NotificationManager` class that holds a list of `NotificationService` objects and broadcasts an alert to all channels simultaneously.

## How I understand it

I created one interface for notifications and then made Email, SMS, and Push follow the same method. The manager does not care which type it is. It just loops through them and sends the same alert to all of them. So I can add another notification type later without changing the main idea.

## Verified output

```text
Email sent to John: Your order is ready!
SMS sent to John: Your order is ready!
Push sent to John: Your order is ready!
```
