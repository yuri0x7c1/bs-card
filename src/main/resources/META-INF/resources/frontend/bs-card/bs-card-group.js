
import { LitElement, html} from 'lit-element';
import { BsCardGroupCss } from './bs-card-group.css.js';

export class BsCardGroup extends LitElement {

    static get styles() {
        return [
            BsCardGroupCss
        ];
    }

    render() {
        return html`
            <slot></slot>
        `;
    }
};

if (!window.customElements.get("bs-card-group"))
    window.customElements.define('bs-card-group', BsCardGroup);
