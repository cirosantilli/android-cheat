# IntentService TextView

How to modify a `TextView` with an `IntentService`.

Expected outcome: after two seconds, the text changes from `before` to `after`.

Toasts and notifications are easier to create from services, where a handler suffices.

But for view modification, we need a broadcast.
