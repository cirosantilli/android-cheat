# IntentService

Minimal uninteresting `IntentService` example.

Expected outcome: after 2 seconds, shows a toast from the service when the app starts. During those two seconds, the UI does not freeze, so the wait must be done in the background.

See also:

- <http://developer.android.com/guide/components/services.html>
- <http://developer.android.com/training/run-background-service/create-service.html>

Simplified implementation of `Service`.

Treats given tasks sequentially.
