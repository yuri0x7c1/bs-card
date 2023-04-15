
import { LitElement, html } from 'lit';
import { BsCardLinkCss } from './bs-card-link.css.js';

export class BsCardLink extends LitElement {

    static get properties() {
        return {
            label: String,
            target: String
        };
    }

    static get styles() {
        return [
            BsCardLinkCss
        ];
    }

    render() {
        return html`
            <a href="${this.target}">${this.label}</a>
        `;
    }

    constructor() {
        super();
        this.label = '';
        this.target = '#';
    }
};

if (!window.customElements.get("bs-card-link"))
    window.customElements.define('bs-card-link', BsCardLink);

