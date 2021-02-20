import { html, LitElement } from "lit-element";
import * as Datebook from "datebook";

class VaadinDatebook extends LitElement {

    constructor() {
        super();
        this.addEventListener('click', this.clickHandler);
    }

    static get properties() {
        return { buttonText: String,
                 calendarOptions: Object,
                 calendarAlarm: Object
        };
    }

    createRenderRoot() {
        return this;
    }

    clickHandler(event) {
        this.calendarOptions.start = new Date(this.calendarOptions.start);
        this.calendarOptions.end = new Date(this.calendarOptions.end);
        const icalendar = new Datebook.ICalendar(this.calendarOptions);
        icalendar.addAlarm(this.calendarAlarm).render();
        icalendar.download();
    }

    render() {
        return html`${this.buttonText}`;
    }

}

customElements.get('vaadin-datebook') || customElements.define('vaadin-datebook', VaadinDatebook);
