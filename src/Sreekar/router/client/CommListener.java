
package sreekar.router.client;

import routing.Pipe.Route;

public interface CommListener {
	/**
	 * identifies the listener - if it needs to be removed or tracked
	 * 
	 * @return
	 */
	String getListenerID();

	/**
	 * receives the message event from the client's channel
	 * 
	 * @param msg
	 *            Both requests and responses are held in the same message
	 *            structure
	 */
	void onMessage(Route msg);
}
