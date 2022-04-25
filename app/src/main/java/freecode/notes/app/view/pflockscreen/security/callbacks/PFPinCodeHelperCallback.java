package freecode.notes.app.view.pflockscreen.security.callbacks;

import freecode.notes.app.view.pflockscreen.security.PFResult;

public interface PFPinCodeHelperCallback<T> {
    void onResult(PFResult<T> result);
}
