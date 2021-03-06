package persist.xmlconfig;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Entries {

	private List<Entry> entries = new LinkedList<Entry>();

	/**
	 * 
	 * @param entry
	 *            ,
	 */
	public void addEntry(Entry entry) {
		entries.add(entry);
	}

	/**
	 * 
	 * @return entries
	 */
	@XmlElement(name = "entry")
	public List<Entry> getEntries() {
		return entries;
	}
	
	public void setEntries(List<Entry> entries){
		this.entries = entries;
	}

}
