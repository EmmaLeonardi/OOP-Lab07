package it.unibo.oop.lab.nesting2;

import java.util.ArrayList;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> listAcceptable;
	private int index;

	/**
	 * {@inheritDoc} 
	 * */
	public OneListAcceptable(List<T> list) {
		this.listAcceptable = new ArrayList<T>(list);
	}

	/**
	 * {@inheritDoc} 
	 * */
	public Acceptor<T> acceptor() {
		this.index = 0;
		return new OneListAcceptor();
	}

	private class OneListAcceptor implements Acceptor<T> {

		private OneListAcceptor() {
		}

		/**
		 * {@inheritDoc} 
		 * */
		public void accept(T newElement) throws ElementNotAcceptedException {
			if (OneListAcceptable.this.listAcceptable.size() > OneListAcceptable.this.index) {
				if (OneListAcceptable.this.listAcceptable.get(OneListAcceptable.this.index).equals(newElement)) {
					OneListAcceptable.this.index++;
				} else {
					throw new ElementNotAcceptedException(newElement);
				}
			} else {
				throw new ElementNotAcceptedException(newElement);
			}

		}

		/**
		 * {@inheritDoc} 
		 * */
		public void end() throws EndNotAcceptedException {
			if (OneListAcceptable.this.index == OneListAcceptable.this.listAcceptable.size()) {
				// The acceptor has arrived at the last element
			} else {
				throw new EndNotAcceptedException();
			}

		}

	}

}
