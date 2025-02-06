import java.util.ArrayList;
import java.util.List;

class SystemController {
    private List<NotifierWrapper> notifiers;

    public SystemController() {
        this.notifiers = new ArrayList<>();
    }

    public void addNotifier(NotifierWrapper notifier) {
        notifiers.add(notifier);
    }

    public void notifySystems(SystemMain system) {
        for (NotifierWrapper notifier : notifiers) {
            notifier.notify(system);
        }
    }
}