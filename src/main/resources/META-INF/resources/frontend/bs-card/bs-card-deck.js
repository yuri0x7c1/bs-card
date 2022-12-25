
import { LitElement, html } from 'lit-element';
import { BsCardDeckCss } from './bs-card-deck.css.js';

export class BsCardDeck extends LitElement {

    static get styles() {
        return [
            BsCardDeckCss
        ];
    }

    render() {
        return html`
            <slot></slot>
        `;
    }
};

if (!window.customElements.get("bs-card-deck"))
    window.customElements.define('bs-card-deck', BsCardDeck);
