import { html, LitElement } from "lit-element";
import * as Datebook from "datebook";

class VaadinDatebook extends LitElement {

    constructor() {
        super();
        //
        // this.calendarOptions = {
        //     title: 'Happy Hour',
        //     location: 'The Bar, New York, NY',
        //     description: 'Let\'s blow off some steam with a tall cold one!',
        //     start: new Date('2021-02-18T23:30:00'),
        //     end: new Date('2021-02-18T23:50:00'),
        //     // an event that recurs every two weeks:
        //     recurrence: {
        //         frequency: 'WEEKLY',
        //         interval: 2
        //     }
        // };
        //
        // this.calendarAlarm = {
        //     action: 'DISPLAY',
        //     trigger: new Date('2021-02-18T23:29:00Z'),
        //     description: 'the event description',
        //     summary: 'a quick summary',
        //     duration: {
        //         after: true,
        //         minutes: 3
        //     }
        // }
    }

    static get properties() {
        return { id: String,
                 width: String,
                 height: String,
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

    firstUpdated(changedProperties) {
        super.firstUpdated(changedProperties);
        // const icalendar = new Datebook.ICalendar(this.calendarOptions);
        // icalendar.addAlarm(this.calendarAlarm).render();
    }

    render() {
        return html`<button id="${this.id}" @click=${this.clickHandler}>Add to Calendar</button>`;
    }

}

customElements.get('vaadin-datebook') || customElements.define('vaadin-datebook', VaadinDatebook);
